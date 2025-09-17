extends Area2D

var g = Global.health




func _on_body_entered(body: Node2D) -> void:
	print(body.name)
	if body.name=="CharacterBody2D":
		body.ouchie()
	pass
