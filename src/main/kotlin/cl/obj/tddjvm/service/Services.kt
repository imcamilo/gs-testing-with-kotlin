package cl.obj.tddjvm.service

import cl.obj.tddjvm.models.Users


/**
 * Created by Camilo Jorquera on 6/10/19
 */
interface UserService {

    fun save(user: Users)

    fun findOne(id: Int): Users

}
