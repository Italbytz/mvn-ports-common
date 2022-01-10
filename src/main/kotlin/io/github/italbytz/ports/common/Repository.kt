package io.github.italbytz.ports.common

/**
 * A `Repository` represents a data storage.
 *
 * In accordance with the official error handling suggestions, it is assumed that failures
 * in the repository do not require local handling by the caller, and should therefore be represented by exceptions.
 * @see <a href="https://github.com/Kotlin/KEEP/blob/master/proposals/stdlib/result.md#error-handling-style-and-exceptions">Error handling style</a>
 */
interface Repository<IdType, EntityType> {

    /**
     * Create an entity.
     *
     * @param entity The entity to create.
     * @return ID of the created entity.
     */
    suspend fun create(entity: EntityType): IdType

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