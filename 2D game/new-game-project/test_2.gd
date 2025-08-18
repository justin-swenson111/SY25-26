extends Node2D

var side = "g"


func _on_ready() -> void:
	var mainChar = load("res://resources/Main.tscn");
	var instance = mainChar.instantiate();
	add_child(instance)
	side = Global.side
	print(side)
	if side == "left":
		instance.global_position = Vector2(170,0)
