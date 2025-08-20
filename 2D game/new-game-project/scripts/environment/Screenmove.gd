extends Node
var side = null;
func _on_body_entered(body: Node2D) -> void:
	if (body.name=="CharacterBody2D"):
		if (name=="LEdge"):
			side = "left"
		elif (name=="REdge"):
			side = "right"
			

		call_deferred("changeScene")
		
func changeScene():
	Global.side=side
	if ("res://test2.tscn"==get_tree().current_scene.scene_file_path):
		get_tree().change_scene_to_file("res://test.tscn")
	else:
		get_tree().change_scene_to_file("res://test2.tscn")
	
