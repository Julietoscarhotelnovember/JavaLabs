public abstract class Robot {
	public abstract String getName();
}

public class SuperRobot extends Robot {
	@Override
	public String getName() {
		return "SuperRobot";
	}
}
public class PowerRobot extends Robot {
	@Override
	public String getName() {
		return "PowerRobot";
	}
}

public class SuperRobotFactory extends RobotFactory {
	@Override
	Robot createRobot(String name) {
		switch( name ){
			case "super": return new SuperRobot();
			case "power": return new PowerRobot();
		}
		return null;
	}
}
public class ModifiedSuperRobotFactory extends RobotFactory {
	@Override
	Robot createRobot(String name) {
		try {
			Class<?> cls = Class.forName(name);
			Object obj = cls.newInstance();
			return (Robot)obj;
		} catch (Exception e) {
			return null;
		}
	}
}

public abstract class RobotFactory {
	abstract Robot createRobot(String name);
}





public class FactoryMethodMain {

}
