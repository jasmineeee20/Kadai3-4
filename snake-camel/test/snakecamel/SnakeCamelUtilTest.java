package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {

	@Test
	public void スネークをキャメルに変換されてるか() {
		SnakeCamelUtil snake = new SnakeCamelUtil();
		//String expected = "AbcDefGhi";
		String actual = snake.snakeToCamelcase("snake_case");
		
		//assertThat(,is(expected));
		System.out.println(actual);
	}
	@Test
	public void キャメルをスネークに変換されてるか() {
		SnakeCamelUtil camel = new SnakeCamelUtil();
		String actual2= camel.camelToSnakecase("CamelCase");
		System.out.println(actual2);
	}
	@Test
	public void test() {
		System.out.println("not yet implemented");
	}

}