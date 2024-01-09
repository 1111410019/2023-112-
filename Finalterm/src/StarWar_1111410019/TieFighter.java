package StarWar_1111410019;

import java.util.Arrays;
import StarWar_1111410019.AirCraft;

public class TieFighter extends AirCraft{
	public String Manufacturer="賽納爾艦隊系統（Sienar FleetSystems）";
	public String Model="雙離子引擎生產線星際戰鬥機（Twin IonEngine Line Starfighter）";
	public double Length=6.3d;
	public double AirSpeed=1200d;
	public String SpaceSpeed="4100 重力加速度(4100G)";
	public String StdandardEngine="SFS P-s4 雙離子引擎";
	public String[] Weapon= {"SFS L-s1 型雷射加農炮","SFS L-s1 型雷射加農炮"};
	public double[] Weapon_power={1000,1000};
	public Integer Passenger=01;
	
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
	
	public TieFighter() {}
	public TieFighter(String Manufacturer,
			String Model,
			double Length,
			double AirSpeed,
			String SpaceSpeed,
			String StdandardEngine,
			String[] Weapon,
			double[] Weapon_power,
			Integer Passenger) {
		this.setManufacturer(Manufacturer);
		this.setModel(Model);
		this.setLength(Length);
		this.setAirSpeed(AirSpeed);
		this.setSpaceSpeed(SpaceSpeed);
		this.setStdandardEngine(StdandardEngine);
		this.setWeapon(Weapon);
		this.setWeapon_power(Weapon_power);
		this.setPassenger(Passenger);
		}
	@Override
	public String toString() {
		return "TieFighter 製造商=" + Manufacturer + ", 型號=" + Model + ", 長度(公尺)=" + Length + ", 大氣中飛行速度(公里/小時)="
				+ AirSpeed + ", 字宙空間加速度=" + SpaceSpeed + ", 標準引擎資料=" + StdandardEngine + ", 武器裝備名="
				+ Arrays.toString(Weapon) + ", 武器裝備能量=" + Weapon_power + ", 乘座人員=" + Passenger + "]";
	}
	
	
}
