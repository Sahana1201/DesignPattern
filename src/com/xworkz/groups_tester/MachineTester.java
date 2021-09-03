package com.xworkz.groups_tester;

import com.xworks.groups_constants.MachineBrand;
import com.xworks.groups_constants.MachineTypes;
import com.xworkz.groups_DTO.MachineDTO;

public class MachineTester {

	public static void main(String[] args) {
		MachineDTO machine = new MachineDTO(MachineTypes.HairdressingMachin, 500f, MachineBrand.philips, true);
		System.out.println(machine);
		MachineDTO machine1 = new MachineDTO(MachineTypes.HairdressingMachin, 1000f, MachineBrand.philips, true);
		System.out.println(machine1);
		System.out.println(machine.equals(machine1));
	}

}
