package net.kodehawa.discord.Mantaro.utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {

	private DateFormat hour = new SimpleDateFormat("HH:mm:ss");
	private Date date = new Date();
	private String hour1 = hour.format(date);
	
	private static Logger instance = new Logger();

	public void print(String s, LogType type)
	{
		System.out.println("[" + hour1 + "] " + "[" + type.toString() + "] [Mantaro] " + s);
	}
	
	public static Logger instance()
	{
		return instance;
	}
}
