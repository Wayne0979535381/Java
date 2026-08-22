package day7.case2;

public class GlassCup extends AbstractCup {
	
	public GlassCup(String name) {
		this.name=name;
	}
	@Override
	public void make() {
		System.out.println("準備製作:" + name);
		System.out.println("杯子容量:" + Cup.capacity);
		System.out.println("玻璃加熱融化");
		System.out.println("吹製成型");
		System.out.println("冷卻定型");
		extraProcess();
		System.out.println("製作完成");
	}
	
	public void extraProcess() {
		System.out.println("加入貼花");
	}
	
}
