#include <stdio.h>
#include <pthread.h>
#include <stdlib.h>

void *thread_function(void *arg) {
    printf("Thread_function estah executando.\n");
    pthread_exit("Obrigado pelo tempo de CPU!.\n");
}

int main() {
    int res;
    pthread_t a_thread;
    void *thread_result;
    char *message = "message de sei lá o que";
    res = pthread_create(&a_thread, NULL, thread_function, NULL);
    res = pthread_join(a_thread, &thread_result);
    printf("Thread joined, retornou %s\n", (char *) thread_result);
    printf("Mensagem agora eh: %s\n", message);
    exit(EXIT_SUCCESS);
}
