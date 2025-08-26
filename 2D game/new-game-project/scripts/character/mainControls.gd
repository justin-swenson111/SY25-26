extends CharacterBody2D

@export var speed = 400
var dir = Vector2.UP
func get_input():
	
	var input_direction = Input.get_vector("Left", "Right", "Up", "Down")
	if input_direction!=Vector2.ZERO:
		dir = input_direction
	velocity = input_direction * speed

func _physics_process(_delta):
	get_input()
	move_and_slide()
	if Input.is_action_just_pressed("attack"):
		var hurt = get_node(str(dir).replace(".","_"))
		hurt.visible=true
		
