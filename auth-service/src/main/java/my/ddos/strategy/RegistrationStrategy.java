package my.ddos.strategy;

public interface RegistrationStrategy<T, R> {
    T register(R entity);
}
