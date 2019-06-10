package cl.obj.tddjvm.service

import cl.obj.tddjvm.models.Users
import cl.obj.tddjvm.repositories.UserRepo


/**
 * Created by Camilo Jorquera on 6/10/19
 */
interface UserService {

    fun save(user: Users)

    fun findOne(id: Int): Users

}

class UserServiceImp(var userRepo: UserRepo):UserService {

    override fun findOne(id: Int): Users {
        return userRepo.findOne(id)
    }

    override fun save(user: Users) {
        userRepo.save(user)
    }

}
