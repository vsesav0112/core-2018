package com.space.se01.main;
import com.space.se01.about.AboutJava;
/* import com.space.se01.about.AboutJava - позволяет нам импортировать весь класс, чтобы нам
не приходилось каждый раз прописывать полный путь до нужного класса:
com.space.se01.about.AboutJava ihha = new com.space.se01.about.AboutJava(); */

public class Main{
	public static void main(String[] args) {
		AboutJava ihha = new AboutJava();
		ihha.printInformation();
	}
}
