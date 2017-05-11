package section2;

public class MyGenClass<K,V> implements MyGenInterface<K,V>{
	public K key;
	public V value;


public MyGenClass(K _key, V _value){
	key = _key;
	value = _value;
}

public K getKey()
{
	return key;
}

public V getValue()

{
	return value;
}

}
