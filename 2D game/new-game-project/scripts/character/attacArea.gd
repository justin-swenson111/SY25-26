extends ShapeCast2D

func _physics_process(delta):
	force_shapecast_update()
	if is_colliding():
		var collision_count = get_collision_count()
		for i in range(collision_count):
			var collider = get_collider(i)
			var collision_point = get_collision_point(i)
			print("Collided with: ", collider.name, " at point: ", collision_point)
			collider.hurt()
			collision_mask &= ~(1 << 1)
			visible=false
