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
CMAKE_SOURCE_DIR = "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads"

# The top-level build directory on which CMake was run.
CMAKE_BINARY_DIR = "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug"

# Include any dependencies generated for this target.
include CMakeFiles/Threads.dir/depend.make

# Include the progress variables for this target.
include CMakeFiles/Threads.dir/progress.make

# Include the compile flags for this target's objects.
include CMakeFiles/Threads.dir/flags.make

CMakeFiles/Threads.dir/main.c.o: CMakeFiles/Threads.dir/flags.make
CMakeFiles/Threads.dir/main.c.o: ../main.c
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --progress-dir="/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_1) "Building C object CMakeFiles/Threads.dir/main.c.o"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -o CMakeFiles/Threads.dir/main.c.o   -c "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/main.c"

CMakeFiles/Threads.dir/main.c.i: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Preprocessing C source to CMakeFiles/Threads.dir/main.c.i"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -E "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/main.c" > CMakeFiles/Threads.dir/main.c.i

CMakeFiles/Threads.dir/main.c.s: cmake_force
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green "Compiling C source to assembly CMakeFiles/Threads.dir/main.c.s"
	/usr/bin/cc $(C_DEFINES) $(C_INCLUDES) $(C_FLAGS) -S "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/main.c" -o CMakeFiles/Threads.dir/main.c.s

# Object files for target Threads
Threads_OBJECTS = \
"CMakeFiles/Threads.dir/main.c.o"

# External object files for target Threads
Threads_EXTERNAL_OBJECTS =

Threads: CMakeFiles/Threads.dir/main.c.o
Threads: CMakeFiles/Threads.dir/build.make
Threads: CMakeFiles/Threads.dir/link.txt
	@$(CMAKE_COMMAND) -E cmake_echo_color --switch=$(COLOR) --green --bold --progress-dir="/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug/CMakeFiles" --progress-num=$(CMAKE_PROGRESS_2) "Linking C executable Threads"
	$(CMAKE_COMMAND) -E cmake_link_script CMakeFiles/Threads.dir/link.txt --verbose=$(VERBOSE)

# Rule to build all files generated by this target.
CMakeFiles/Threads.dir/build: Threads

.PHONY : CMakeFiles/Threads.dir/build

CMakeFiles/Threads.dir/clean:
	$(CMAKE_COMMAND) -P CMakeFiles/Threads.dir/cmake_clean.cmake
.PHONY : CMakeFiles/Threads.dir/clean

CMakeFiles/Threads.dir/depend:
	cd "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug" && $(CMAKE_COMMAND) -E cmake_depends "Unix Makefiles" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug" "/home/lino.veloso/dev/dev-ufsc/2020#/INE5611 - Sistemas Operacionais/linguagem-c/Threads/cmake-build-debug/CMakeFiles/Threads.dir/DependInfo.cmake" --color=$(COLOR)
.PHONY : CMakeFiles/Threads.dir/depend
