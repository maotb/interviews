package main.java.Chapter_13.Section_2;

/**
 * 单例模式:单例模式是一种常用的软件设计模式。在它的核心结构中只包含一个被称为单例的特殊类。通过单例模式可以保证系统中一个类只有一个实例。即一个类只有一个对象实例
 * 保证一个类仅有一个实例，并提供一个访问它的全局访问点 一个类有且仅有一个实例，并且自行实例化向整个系统提供
 * @author maotb
 * @version 1.0 2016-06-17
 */

/*
 * 饿汉式
 */
class Singleton {

	// 定义私有构造方法，这样就不存在默认构造方法。不可以通过构造方法进行实例化
	private Singleton() {
	}

	// 那么如果实例化这个类呢
	// 只能在自己的内部定义自己一个实例
	// 注意，这是private，只供内部调用
	private static Singleton instance = new Singleton();

	// 自己定一个实例需要提供给外界使用
	// 这里提供一个供外部访问本class的静态方法，可以直接访问
	public static Singleton getInstance() {
		return instance;
	}
}

/*
 * 懒汉式
 */
class Singleton2 {

	// 定义私有构造方法，这样就不存在默认构造方法。不可以通过构造方法进行实例化
	private Singleton2() {
	}

	private static Singleton2 instance = null;

	// 在多线程的情况下，，如果现在存在着线程A和B，代码执行情况是这个样子的，线程A执行到了If(singleton== null)，线程B执行到了Singleton = new Singleton();
	// 线程B虽然实例化了一个Singleton，但是对于线程A来说判断singleton还是没有初始化的，所以线程A还会对singleton进行初始化。
	// 因此这里使用synchronized来保障线程安全
	// 这样的话，当线程B访问这个函数的时候，其他的任何要访问该函数的代码不能执行，直到线程B执行完该函数（这是利用锁实现的）。
	public static synchronized Singleton2 getInstance() {
		// 这种方法比上面有所改进，不用每次都进行生成对象，只是第一次使用时生成实例，提高了效率
		if (instance == null) {
			instance = new Singleton2();
		}
		return instance;
	}

}
