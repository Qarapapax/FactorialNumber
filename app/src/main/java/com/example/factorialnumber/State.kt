package com.example.factorialnumber

sealed class State

object Error : State()
object Progress : State()
class Result(val factorial: String) : State()