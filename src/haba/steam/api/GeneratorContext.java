package haba.steam.api;

public interface GeneratorContext<T> {
    void emit(T value);
}