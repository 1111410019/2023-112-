package StarWar_1111410019;

import java.util.Arrays;
import StarWar_1111410019.TieFighter;
import StarWar_1111410019.XWing;

public class AirCraft {
	private String Manufacturer;
	private String Model;
	public double Length;
	public double AirSpeed;
	public String SpaceSpeed;
	public String StdandardEngine;
	public String HyperSpaceEngine;
	public String[] Weapon;
	public double[] Weapon_power;
	public Integer Passenger;
	public String[] Shield;
	public String[] ShieldPower;
	
	//getter and setter
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}
	
	public double[] getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(double[] weapon_power) {
		Weapon_power = weapon_power;
	}
	public Integer getPassenger() {
		return Passenger;
	}
	public void setPassenger(Integer passenger) {
		Passenger = passenger;
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public String[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(String[] shieldPower) {
		ShieldPower = shieldPower;
	}
	public AirCraft(){}
	public AirCraft(String Manufacturer,
			String Model,
			double Length,
			double AirSpeed,
			String SpaceSpeed,
			String StdandardEngine,
			String HyperSpaceEngine,
			String[] Weapon,
			double[] Weapon_power,
			Integer Passenger,
			String[] Shield,
			String[] ShieldPower) {
		this.setManufacturer(Manufacturer);
		this.setModel(Model);
		this.setLength(Length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setHyperSpaceEngine(HyperSpaceEngine);
		this.setWeapon(Weapon);
		this.setWeapon_power(Weapon_power);
		this.setPassenger(Passenger);
		this.setShield(Shield);
		this.setShieldPower(ShieldPower);
	}
	@Override
	public String toString() {
		return "AirCraft [Manufacturer=" + Manufacturer + ", Model=" + Model + ", Length=" + Length + ", AirSpeed="
				+ AirSpeed + ", SpaceSpeed=" + SpaceSpeed + ", StdandardEngine=" + StdandardEngine
				+ ", HyperSpaceEngine=" + HyperSpaceEngine + ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power="
				+ Weapon_power + ", Passenger=" + Passenger + ", Shield=" + Arrays.toString(Shield) + ", ShieldPower="
				+ Arrays.toString(ShieldPower) + "]";
	}
	
	
	
	
}
