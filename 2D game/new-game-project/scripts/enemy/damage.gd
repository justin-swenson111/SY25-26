extends CharacterBody2D

var health = 5

func hurt():
	health-=1
	print(health)
	if health == 0:
		queue_free()
