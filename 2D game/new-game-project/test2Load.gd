extends Node2D
 

func _ready() -> void:
	var mainChar = load("res://resources/Main.tscn");
	var instance = mainChar.instantiate();
	add_child(instance)
	
