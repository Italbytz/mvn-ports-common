package io.github.italbytz.ports.common

/**
 * A `DataSource` represents a data source.
 */
interface DataSource<IdType, EntityType> {
    /**
     * Retrieves an entity.
     *
     * @param id ID of the entity to retrieve.
     * @return An entity.
     */
    suspend fun retrieve(id: IdType): EntityType

    /**
     * Retrieves all entities.
     *
     * @return All entities.
     */
    suspend fun retrieveAll(): List<EntityType>
}