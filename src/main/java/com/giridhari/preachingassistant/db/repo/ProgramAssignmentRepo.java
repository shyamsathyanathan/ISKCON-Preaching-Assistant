package com.giridhari.preachingassistant.db.repo;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.giridhari.preachingassistant.db.model.Devotee;
import com.giridhari.preachingassistant.db.model.Program;
import com.giridhari.preachingassistant.db.model.ProgramAssignment;

@Repository
public interface ProgramAssignmentRepo extends PagingAndSortingRepository<ProgramAssignment, Long> {
	public Page<ProgramAssignment> findByProgram_id(long programId, Pageable pageable);
	public Page<ProgramAssignment> findByAttendee_id(long devoteeId, Pageable pageable);
	
	public List<ProgramAssignment> findByProgram(Program program);
}