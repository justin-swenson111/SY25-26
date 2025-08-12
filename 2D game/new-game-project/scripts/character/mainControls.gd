extends RigidBody2D


func _on_body_entered(body: Node) -> void:
	print("collided with" +body.name)
	pass # Replace with function body.


func _on_ready() -> void:
	print("running")
	pass # Replace with function body.
