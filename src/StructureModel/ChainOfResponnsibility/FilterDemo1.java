package StructureModel.ChainOfResponnsibility;

/**
 * Created by sunpengwei on 2017/5/8.
 */
public class FilterDemo1 implements Filter {
	@Override
	public void doFilter(String str) {
		System.out.println("---filterDemo1---"+str);
	}
}
