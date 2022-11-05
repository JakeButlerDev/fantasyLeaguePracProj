package com.butler.fantasyLeaguePracProj.models;

import javax.persistence.*;
import java.util.*;

@Entity
public class League {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    @Column
    @ElementCollection(targetClass=FantasyTeam.class)
    private ArrayList<FantasyTeam> teams = new ArrayList<FantasyTeam>();
//    {
//        @Override
//        public int size() {
//            return 0;
//        }
//
//        @Override
//        public boolean isEmpty() {
//            return false;
//        }
//
//        @Override
//        public boolean contains(Object o) {
//            return false;
//        }
//
//        @Override
//        public Iterator<FantasyTeam> iterator() {
//            return null;
//        }
//
//        @Override
//        public Object[] toArray() {
//            return new Object[0];
//        }
//
//        @Override
//        public <T> T[] toArray(T[] a) {
//            return null;
//        }
//
//        @Override
//        public boolean add(FantasyTeam fantasyTeam) {
//            return false;
//        }
//
//        @Override
//        public boolean remove(Object o) {
//            return false;
//        }
//
//        @Override
//        public boolean containsAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(Collection<? extends FantasyTeam> c) {
//            return false;
//        }
//
//        @Override
//        public boolean addAll(int index, Collection<? extends FantasyTeam> c) {
//            return false;
//        }
//
//        @Override
//        public boolean removeAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public boolean retainAll(Collection<?> c) {
//            return false;
//        }
//
//        @Override
//        public void clear() {
//
//        }
//
//        @Override
//        public FantasyTeam get(int index) {
//            return null;
//        }
//
//        @Override
//        public FantasyTeam set(int index, FantasyTeam element) {
//            return null;
//        }
//
//        @Override
//        public void add(int index, FantasyTeam element) {
//
//        }
//
//        @Override
//        public FantasyTeam remove(int index) {
//            return null;
//        }
//
//        @Override
//        public int indexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public int lastIndexOf(Object o) {
//            return 0;
//        }
//
//        @Override
//        public ListIterator<FantasyTeam> listIterator() {
//            return null;
//        }
//
//        @Override
//        public ListIterator<FantasyTeam> listIterator(int index) {
//            return null;
//        }
//
//        @Override
//        public List<FantasyTeam> subList(int fromIndex, int toIndex) {
//            return null;
//        }
//    };
    @Column
    @ElementCollection(targetClass=FantasyTeam.class)
    private ArrayList<FantasyTeam> standings = new ArrayList<>();    // Could use <String> to omly store team names, but what if I want record as well, waiver order, etc.
    private String name;

    public League(ArrayList<FantasyTeam> teams, String name) {
        this.teams = teams;
        this.name = name;
    }

    public League() { }

    public ArrayList<FantasyTeam> getTeams() {
        return teams;
    }

    public ArrayList<FantasyTeam> getStandings() {
        return standings;
    }

    public void setStandings(ArrayList<FantasyTeam> standings) {
        this.standings = standings;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
