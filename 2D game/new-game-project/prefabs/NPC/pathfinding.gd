extends CharacterBody2D

var speed = 50

var health = 5

func hurt():
	health-=1
	print(health)
	if health == 0:
		queue_free()

func _physics_process(_delta):
	var world = get_parent()
	var main = world.get_node("Main")
	var pos = main.position
	var direction = (pos-position).normalized()
	velocity = direction*speed
	move_and_slide()
	
