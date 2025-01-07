package ex05_노형우;

public abstract class Zoo {

	//필드
	Animal[] animals;
	int animalCount;
	
	//생성자
	public Zoo(int animalCount) {
		this.animalCount = animalCount;
	}
	
	//메소드
	abstract void addAnimal(Animal[]animals);{
		for(Animal data :animals) {
			if(this.animalCount > animals.length) {
				System.out.println("더 이상 동물을 추가할 수 없습니다");
			}
		}
	}
	
	//메소드
	void printAllAnimals(Animal animals) {
	
	}


	
	
	
}
