package sample.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "2.49.0" }, date = "2021-10-18T22:43:49.263-0300")
@org.seasar.doma.DomainTypeImplementation
public final class _Amount extends org.seasar.doma.jdbc.domain.AbstractDomainType<java.math.BigDecimal, sample.entity.Amount> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("2.49.0");
    }

    private static final _Amount singleton = new _Amount();

    private _Amount() {
        super(org.seasar.doma.internal.wrapper.WrapperSuppliers.ofBigDecimal());
    }

    @Override
    protected sample.entity.Amount newDomain(java.math.BigDecimal value) {
        if (value == null) {
            return null;
        }
        return new sample.entity.Amount(value);
    }

    @Override
    protected java.math.BigDecimal getBasicValue(sample.entity.Amount domain) {
        if (domain == null) {
            return null;
        }
        return domain.getValue();
    }

    @Override
    public Class<?> getBasicClass() {
        return java.math.BigDecimal.class;
    }

    @Override
    public Class<sample.entity.Amount> getDomainClass() {
        return sample.entity.Amount.class;
    }

    /**
     * @return the singleton
     */
    public static _Amount getSingletonInternal() {
        return singleton;
    }

}
