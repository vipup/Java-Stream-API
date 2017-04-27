package haba.steam.api;

public interface Generator<T> {
    void generate(GeneratorContext<T> context);
}

