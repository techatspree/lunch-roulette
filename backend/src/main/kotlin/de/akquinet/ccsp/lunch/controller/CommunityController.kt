package de.akquinet.ccsp.lunch.controller

import de.akquinet.ccsp.lunch.data.Community
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/rest/communities")
class CommunityController : AbstractController<Community>() {
    override val repository: LunchRepository<Community> get() = injectedRepository

    @Autowired
    lateinit var injectedRepository: CommunityRepository
}
