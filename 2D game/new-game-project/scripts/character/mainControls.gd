extends CharacterBody2D

@export var speed = 400
var dir = Vector2.UP
var canAttack = true
func get_input():
	
	var input_direction = Input.get_vector("Left", "Right", "Up", "Down")
	if input_direction!=Vector2.ZERO:
		dir = input_direction
	velocity = input_direction * speed

func _physics_process(_delta):
	get_input()
	move_and_slide()
	if Input.is_action_just_pressed("attack") && canAttack:
		print("attack")
		canAttack=false
		var hurt = get_node(str(dir).replace(".","_"))
		hurt.visible=true
		hurt.collision_mask |= (1 << 1)
		await get_tree().create_timer(0.25).timeout
		stopAttack(hurt)
		await get_tree().create_timer(0.5).timeout
		attackDelay()
		
func stopAttack(hurt):
	hurt.visible=false
	hurt.collision_mask &= ~(1 << 1)
	
func attackDelay():
	canAttack=true
	
func ouchie():
	Global.health-=1
	print(Global.health)


		
