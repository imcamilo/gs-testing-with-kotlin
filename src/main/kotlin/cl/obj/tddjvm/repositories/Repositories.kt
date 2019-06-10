package cl.obj.tddjvm.repositories

import cl.obj.tddjvm.models.Users


/**
 * Created by Camilo Jorquera on 6/10/19
 */
interface UserRepo {

    fun save(user: Users)

    fun findOne(id: Int): Users

}