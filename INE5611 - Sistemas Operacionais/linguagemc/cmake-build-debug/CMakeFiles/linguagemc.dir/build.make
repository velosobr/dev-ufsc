# CMAKE generated file: DO NOT EDIT!
# Generated by "Unix Makefiles" Generator, CMake Version 3.17

# Delete rule output on recipe failure.
.DELETE_ON_ERROR:


#=============================================================================
# Special targets provided by cmake.

# Disable implicit rules so canonical targets will work.
.SUFFIXES:


# Disable VCS-based implicit rules.
% : %,v


# Disable VCS-based implicit rules.
% : RCS/%


# Disable VCS-based implicit rules.
% : RCS/%,v


# Disable VCS-based implicit rules.
% : SCCS/s.%


# Disable VCS-based implicit rules.
% : s.%


.SUFFIXES: .hpux_make_needs_suffix_list


# Command-line flag to silence nested $(MAKE).
$(VERBOSE)MAKESILENT = -s

# Suppress display of executed commands.
$(VERBOSE).SILENT:


# A target that is always out of date.
cmake_force:

.PHONY : cmake_force

#=============================================================================
# Set environment variables for the build.

# The shell in which to execute make rules.
SHELL = /bin/sh

# The CMake executable.
CMAKE_COMMAND = /home/lino.veloso/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/202.7319.62/bin/cmake/linux/bin/cmake

# The command to remove a file.
RM = /home/lino.veloso/.local/share/JetBrains/Toolbox/apps/CLion/ch-0/202.7319.62/bin/cmake/linux/bin/cmake -E rm -f

# Escaping for special characters.
EQUALS = =

# The top-level source directory on which CMake was run.
CMAKE_SOURCE_DIR = "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/linguagemc.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/linguagemc.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/linguagemc.dir/flags.make

CMakeFiles/linguagemc.dir/main.c.o: CMakeFiles/linguagemc.dir/flags.make
CMakeFiles/linguagemc.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/linguagemc.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/linguagemc.dir/main.c.o   -c "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/main.c"

CMakeFiles/linguagemc.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/linguagemc.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/main.c" > CMakeFiles/linguagemc.dir/main.c.i

CMakeFiles/linguagemc.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/linguagemc.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/main.c" -o CMakeFiles/linguagemc.dir/main.c.s

CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.o: CMakeFiles/linguagemc.dir/flags.make
CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.o: ../Ponteiros/ex1.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Building C object CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.o   -c "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/Ponteiros/ex1.c"

CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/Ponteiros/ex1.c" > CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.i

CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/Ponteiros/ex1.c" -o CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.s

# Object files for target linguagemc
linguagemc_OBJECTS = \
"CMakeFiles/linguagemc.dir/main.c.o" \
"CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.o"

# External object files for target linguagemc
linguagemc_EXTERNAL_OBJECTS =

linguagemc: CMakeFiles/linguagemc.dir/main.c.o
linguagemc: CMakeFiles/linguagemc.dir/Ponteiros/ex1.c.o
linguagemc: CMakeFiles/linguagemc.dir/build.make
linguagemc: CMakeFiles/linguagemc.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_3) "Linking C executable linguagemc"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/linguagemc.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/linguagemc.dir/build: linguagemc

.PHONY : CMakeFiles/linguagemc.dir/build

CMakeFiles/linguagemc.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/linguagemc.dir/cmake_clean.cmake
.PHONY : CMakeFiles/linguagemc.dir/clean

CMakeFiles/linguagemc.dir/depend:
	cd "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagemc/cmake-build-debug/CMakeFiles/linguagemc.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/linguagemc.dir/depend

