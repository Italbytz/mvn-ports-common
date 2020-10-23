package de.hshl.isd.explicitarchitecture

/**
 * A `Repository` represents a data storage.
 */
interface Repository<IdType, EntityType> {

    /**
     * Create an entity.
     *
     * @param entity The entity to create.
     * @return ID of the created entity.
     */
    suspend fun create(entity: EntityType): Result<Long>

    /**
     * Retrieves an entity.
     *
     * @param id ID of the entity to retrieve.
     * @return An entity.
     */
    suspend fun retrieve(id: IdType): Result<EntityType>

    /**
     * Retrieves all entities.
     *
     * @return All entities.
     */
    suspend fun retrieveAll(): Result<List<EntityType>>

    /**
     * Updates an entity.
     *
     * @param id ID of the entity to update.
     * @param entity Updated entity.
     * @return Boolean indicating success or failure.
     */
    suspend fun update(id: IdType, entity: EntityType): Result<Boolean>

    /**
     * Deletes an entity.
     *
     * @param id ID of the entity to delete.
     * @return Boolean indicating success or failure.
     */
    suspend fun delete(id: IdType): Result<Boolean>
}