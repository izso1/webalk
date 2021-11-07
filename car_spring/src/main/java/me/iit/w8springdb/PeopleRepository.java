package me.iit.w8springdb;

import org.springframework.data.repository.PagingAndSortingRepository;

public interface PeopleRepository extends PagingAndSortingRepository<People, Long> {
}
