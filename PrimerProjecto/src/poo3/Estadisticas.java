package poo3;

public interface Estadisticas<T> {
	T mayor();

	T menor();

	double media();

	T[] mayoresQue(T obj);

	T[] menoresQue(T obj);
}
