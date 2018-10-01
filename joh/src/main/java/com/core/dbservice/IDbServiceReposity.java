package com.core.dbservice;
import java.util.List;
public interface IDbServiceReposity<T> {
	int Add(T t);
	
	int Modify(T t);
	
	int Del(T t);
	
	int Delete(int Id);
	
	List<?> Select(T t);
}
