package io.quarkiverse.jdbc.clickhouse.runtime;

import io.agroal.api.configuration.supplier.AgroalDataSourceConfigurationSupplier;
import io.quarkus.agroal.runtime.AgroalConnectionConfigurer;

/**
 * Emply Agoral configurer
 *
 * @author Alexey Sharandin <sanders@yandex.ru>
 */
public class ClickHouseAgroalConnectionConfigurer implements AgroalConnectionConfigurer {

    @Override
    public void disableSslSupport(String databaseKind, AgroalDataSourceConfigurationSupplier dataSourceConfiguration) {
        // do not log anything for H2
    }

    @Override
    public void setExceptionSorter(String databaseKind, AgroalDataSourceConfigurationSupplier dataSourceConfiguration) {
        // Do not log a warning: we don't have an exception sorter for H2,
        // but there is nothing the user can do about it.
    }
}
