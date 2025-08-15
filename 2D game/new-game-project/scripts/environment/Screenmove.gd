extends Node


func _on_body_entered(body: Node2D) -> void:
	if (body.name=="CharacterBody2D"):
		if (name=="LEdge"):
			get_tree().change_scene_to_file("res://test2.tscn")
			var mainChar = load("res://resources/Main.tscn");
		if (name=="REdge"):
			get_tree().change_scene_to_file("res://Test.tscn")
