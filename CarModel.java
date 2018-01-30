package com.tencent.j2ee;

public class CarModel {

	/**
	 * type : 经销商类别
	 * city : 城市
	 * name : 销售人员
	 * num  : 销售数量
	 * income : 销售收入
	 * ratio : 分成比例
	 * bonus : 奖金
	 */
	private String type; 
	private String city;
	private String name;
	private int	num;
	private double income;
	private double ratio;
	private double bonus;
	
	public CarModel(String type, String city, String name, 
			int num, double income, double ratio, double bonus) {
		this.type = type;
		this.city = city;
		this.name = name;
		this.num = num;
		this.income = income;
		this.ratio = ratio;
		this.bonus = bonus;
	}
	
	@Override
	public boolean equals(Object object) {
		if (object == null) {
			return false;
		} else {
			if (this.getClass() == object.getClass()) {
				CarModel carModel = (CarModel)object;
				if (this.getType().equals(carModel.getType()) &&
						this.getCity().equals(carModel.getCity()) &&
						this.getName().equals(carModel.getName())) {
					return true;
				} else {
					return false;
				}
			} else {
				return false;
			}
		}
	}
	
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	public String getType() {
		return type;
	}

	public String getCity() {
		return city;
	}

	public String getName() {
		return name;
	}

	public int getNum() {
		return num;
	}

	public double getIncome() {
		return income;
	}

	public double getRatio() {
		return ratio;
	}

	public double getBonus() {
		return bonus;
	}
	
	
	
}
