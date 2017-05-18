package snakecamel;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

public class SnakeCamelUtilTest {
	/*@Test
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
	}*/
	/*@Test
	public void test() {
		System.out.println("not yet implemented");
	}*/
	@Test
	 public void キャメルケース() {
		SnakeCamelUtil src = new SnakeCamelUtil();
		String actual3 = src.capitalize("a");
		String actual4 = src.capitalize("xyz");
		//String actual7 = src.capitalize("");
		System.out.println(actual4);
		System.out.println(actual3);
		//System.out.println(actual7);
	}
	@Test
	public void アンキャメルケース() {
		SnakeCamelUtil src2 = new SnakeCamelUtil();
		String actual5 = src2.uncapitalize("A");
		String actual6 = src2.uncapitalize("Xyz");
		//String actual8 = src2.capitalize("");
		System.out.println(actual5);
		System.out.println(actual6);
		//System.out.println(actual8);
	}
	@Test
	public void スネイクキャメル () {
		SnakeCamelUtil src3 = new SnakeCamelUtil();
		String actual7 = src3.snakeToCamelcase("abc");
		String actual11 = src3.snakeToCamelcase("abc_def");
		String actual8 = src3.snakeToCamelcase("abc_def_gh");
		String actual9 = src3.snakeToCamelcase("abc__def___gh");
		String actual10 = src3.snakeToCamelcase("_abc_def__");
		//String actual8 = src2.capitalize("");
		System.out.println(actual7);
		System.out.println(actual8);
		System.out.println(actual9);
		System.out.println(actual10);
		System.out.println(actual11);
	}
	@Test
	public void キャメルスネいく () {
		SnakeCamelUtil src4 = new SnakeCamelUtil();
		String actual11 = src4.camelToSnakecase("Abc");
		String actual12 = src4.camelToSnakecase("AbcDef");
		String actual14 = src4.camelToSnakecase("AbcDefGh");
		//String actual8 = src2.capitalize("");
		System.out.println(actual11);
		System.out.println(actual12);
		System.out.println(actual14);
		//System.out.println(actual8);
	}
}