extends Node
var side = null;
func _on_body_entered(body: Node2D) -> void:
	if (body.name=="CharacterBody2D"):
		
		if (name=="LEdge"):
			side = "left"
			get_tree().change_scene_to_file("res://test2.tscn")
		if (name=="REdge"):
			side = "right"
			get_tree().change_scene_to_file("res://Test.tscn")
			
