package com.pluralsight.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pluralsight.model.Goal;
import com.pluralsight.model.GoalReport;

@Repository("goalRepository")
public class GoalRepositoryImpl implements GoalRepository {

	@PersistenceContext
	private EntityManager em;

	public Goal save(Goal goal) {
		if (goal.getId() == null) {
			em.persist(goal);
			em.flush();
		} else {
			goal = em.merge(goal);
		}

		return goal;
	}

	public List<Goal> loadAll() {
		Query query = em.createQuery("select g from Goal g");
		List<Goal> goals = query.getResultList();
		return goals;
	}

	public List<GoalReport> findAllGoalReports() {
//		Query query = em.createQuery(
//				"select new com.pluralsight.model.GoalReport(g.minutes, e.minutes, e.activity) from Goal g, Exercise e where g.id = e.goal.id");
		TypedQuery<GoalReport> query = em.createNamedQuery(Goal.FIND_GOAL_REPORTS, GoalReport.class);
		return query.getResultList();
	}

}
