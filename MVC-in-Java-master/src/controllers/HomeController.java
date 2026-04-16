package controllers;

import java.util.ArrayList;
import models.Event;

import core.Controller;
import views.HomeView;

import javax.swing.*;

public class HomeController extends Controller
{
	private HomeView homeView;
	private ArrayList<Event> eventos = new ArrayList<>();

	@Override
	public void run()
	{
		homeView = new HomeView(this, mainFrame);
		mainFrame.setVisible(true);
	}

	public void agregarEvento(String desc, String email)
	{
		Event e = new Event(desc, email);
		eventos.add(e);
		System.out.println("Evento guardado: " + desc + " - " + email);
	}
}