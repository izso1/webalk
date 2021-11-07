package me.iit.w8carapp;

import me.iit.w8carapp.impl.BelsoegesuMotor;
import me.iit.w8carapp.impl.WheelImpl;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication
public class W8CarAppApplication implements CommandLineRunner {

	private Motor motor;
	private String type;

	public static void main(String[] args) {
		SpringApplication.run(W8CarAppApplication.class, args);
	}

	private static Wheel[] getKerekek() {
		int sizeOfTheArray = 4;
		Wheel[] kerekek = new Wheel[sizeOfTheArray];

		for (int i = 0; i < sizeOfTheArray; i++) {
			kerekek[i] = new WheelImpl(205, 15, 65);
		}
		return kerekek;
	}

	@Override
	public void run(String... args) throws Exception {
		motor = new BelsoegesuMotor(100, 1600);
		type = "Opel Astra";
		Car autoAstra = new Car(getKerekek(), motor, type);
		System.out.println(autoAstra);
	}

}
