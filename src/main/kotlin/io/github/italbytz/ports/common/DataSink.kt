package io.github.italbytz.ports.common

/**
 * A `DataSink` represents a data sink.
 */
interface DataSink<IdType, EntityType> {
    /**
     * Create an entity.
     *
     * @param entity The entity to create.
     * @return ID of the created entity.
     */
    suspend fun create(entity: EntityType): IdType

    /**
     * Updates an entity.
     *
     * @param id ID of the entity to update.
     * @param entity Updated entity.
     * @return Boolean indicating success or failure.
     */
    suspend fun update(id: IdType, entity: EntityType): Boolean

    /**
     * Deletes an entity.
     *
     * @param id ID of the entity to delete.
     * @return Boolean indicating success or failure.
     */
    suspend fun delete(id: IdType): Boolean
}