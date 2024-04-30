package org.eqasim.core.simulation.mode_choice.parameters;

import org.eqasim.core.simulation.mode_choice.ParameterDefinition;

public class ModeParameters implements ParameterDefinition {
	public class CarParameters {
		public double alpha_u = 0.0;
		public double betaTravelTime_u_min = 0.0;

		public double additionalAccessEgressWalkTime_min = 0.0;
		public double constantParkingSearchPenalty_min = 0.0;
	}

	public class PtParameters {
		public double alpha_u = 0.0;
		public double betaLineSwitch_u = 0.0;
		public double betaInVehicleTime_u_min = 0.0;
		public double betaWaitingTime_u_min = 0.0;
		public double betaAccessEgressTime_u_min = 0.0;
	}

	public class BikeParameters {
		public double alpha_u = 0.0;
		public double betaTravelTime_u_min = 0.0;
		public double betaAgeOver18_u_a = 0.0;
	}

	public class WalkParameters {
		public double alpha_u = 0.0;
		public double betaTravelTime_u_min = 0.0;
		public double betaAccessEgressTravelTime_u_min = 0.0;
	}

	public class DrtParameters {
		public double alpha_u = 0.0;
		public double betaTravelTime_u_min = 0.0;
		public double betaWaitingTime_u_min = 0.0;
		public double betaAccessEgressTime_u_min = 0.0;
	}


	public double lambdaCostEuclideanDistance = 0.0;
	public double referenceEuclideanDistance_km = 0.0;

	public double betaCost_u_MU = 0.0;

	public final CarParameters car = new CarParameters();
	public final PtParameters pt = new PtParameters();
	public final BikeParameters bike = new BikeParameters();
	public final WalkParameters walk = new WalkParameters();
	public final DrtParameters drt = new DrtParameters();
	public double referenceHouseholdIncome = 0.0;
	public double lambda_time = 0.0;
	public double lambda_cost = 0.0;
}