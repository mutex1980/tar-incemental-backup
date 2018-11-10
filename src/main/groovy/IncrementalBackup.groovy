public class IncrementalBackup {
    public static void main(String[] args) {
        def cli = new CliBuilder(usage: 'incrementalbackup [options] <src folder> <backup folder>', header: 'options:')
        cli.with {
            h longOpt: 'help', 'Show usage information'
            t longOpt: 'tar-executable', 'full path to tar executable'
        }
        def options = cli.parse(args)

        if (!options || options.h || options.arguments()!=2) {
            cli.usage()
            return
        }

        GString srcFolder = options.arguments().get(0)
        GString backupFolder = options.arguments().get(1)



        return;
    }
}
