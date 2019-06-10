package cl.obj.tddjvm

import cl.obj.tddjvm.models.Users
import cl.obj.tddjvm.repositories.UserRepo
import cl.obj.tddjvm.service.UserService
import cl.obj.tddjvm.service.UserServiceImp
import spock.lang.Specification


/**
 * Created by Camilo Jorquera on 5/30/19
 */
class ServicesTest extends Specification {

    UserServiceImp service
    UserRepo repository = Stub(UserRepo)

    def setup() {
       service = new UserServiceImp(repository)
    }

    def "test findOne"() {
        given:
            Integer id = 1l
            def users = new Users("X")
            repository.findOne(_ as Integer) >> users
        when:
            def res = service.findOne(id)
        then:
            res instanceof Users
    }

    def "test save"() {
        given:
            def resu = null
            Users user= new Users("XX")
            repository.save(_ as Users) >> resu
        when:
            def res = service.save(user)
        then:
            res == resu
    }

}
