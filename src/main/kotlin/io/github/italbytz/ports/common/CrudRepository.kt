package io.github.italbytz.ports.common

/**
 * A `CrudRepository` represents a data storage.
 */
interface CrudRepository<IdType, EntityType> : Repository,
    DataSource<IdType, EntityType>, DataSink<IdType, EntityType> {
}