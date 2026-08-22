package day12;

import java.time.LocalDateTime;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 
 * Supplier 供應
 * 
 * 不用輸入 -> 只負責提供資料
 * 
 * 
 * @FunctionalInterface
public interface Supplier<T> {
    T get();
}
 **/

public class TestSuppler {
	
	public static void main(String[] args) {
		
	
	Supplier<Integer> luckyNumber = () -> new Random().nextInt(99) + 1;
	System.out.println(luckyNumber.get());
	
	
	Supplier<LocalDateTime> now = () -> LocalDateTime.now();
	System.out.println(now.get());
}	
}
